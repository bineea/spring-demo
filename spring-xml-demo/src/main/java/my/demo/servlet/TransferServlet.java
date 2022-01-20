package my.demo.servlet;

import com.alibaba.fastjson.JSON;
import my.demo.manager.TransferManager;
import my.demo.pojo.Result;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

@WebServlet(name = "transferServlet", urlPatterns = "/transferServlet")
public class TransferServlet extends HttpServlet {

    private TransferManager transferManager;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求体的字符编码
        req.setCharacterEncoding("UTF-8");

        String fromAccountNo = req.getParameter("fromAccountNo");
        String toAccountNo = req.getParameter("toAccountNo");
        String moneyStr = req.getParameter("money");
        BigDecimal money = new BigDecimal(moneyStr);

        Result result = new Result();
        try {
            // 2. 调用service层方法
            transferManager.handleTransfer(fromAccountNo,toAccountNo,money);
            result.setStatus("200");
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus("201");
            result.setMessage(e.toString());
        }

        // 响应
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().print(JSON.toJSON(result));
    }

    @Override
    public void init() throws ServletException {
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        transferManager = (TransferManager) webApplicationContext.getBean("transferManager");
    }
}
