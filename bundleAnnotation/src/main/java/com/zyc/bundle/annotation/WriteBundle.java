package com.zyc.bundle.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author Zyc on date 2022/11/10
 * <p>
 * description: 通过apt，编辑期间生成java代码获取Bundle参数； 支持int、long、float、double、boolean、String、Serializable、Parcelable参数注解；
 * 1、可设置默认值如：@WriteBundle  String str = "默认值";
 * 2、不能被 private修饰, 否则编译会报错
 * 3、kotlin代码还需加@JvmField（编译器不生成get、set方法并将其桌位字段公开）,否则读不到值；如 @JvmField @WriteBundle var str = "默认值"
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface WriteBundle {
    String name() default "";
}

