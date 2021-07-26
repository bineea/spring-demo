package my.demo.manager.annotation;


import org.springframework.util.StringUtils;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 注：当被校验对象为空时，校验为通过，所以如果需要校验对象必填，请自行结合相关校验注解
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {SameTenant.StringChecker.class, SameTenant.LongChecker.class})
@Documented
public @interface SameTenant {
    String message() default "用户不存在或者不属于当前组织";

    Class<?>[] group() default {};
    Class<? extends Payload>[] payload() default {};

    class StringChecker implements ConstraintValidator<SameTenant, String> {

        @Override
        public void initialize(SameTenant arg0) {
        }

        @Override
        public boolean isValid(String uid, ConstraintValidatorContext context) {

            System.out.print("到注解里面了"+uid);
            if (!StringUtils.hasText(uid)) {
                return true;
            }
            return false;
        }
    }

    class LongChecker implements ConstraintValidator<SameTenant, Long> {

        @Override
        public void initialize(SameTenant arg0) {
        }

        @Override
        public boolean isValid(Long uid, ConstraintValidatorContext context) {
            if (null == uid) {
                return true;
            }
            return false;
        }
    }
}
