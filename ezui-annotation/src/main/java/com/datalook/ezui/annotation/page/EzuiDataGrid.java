package com.datalook.ezui.annotation.page;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented 
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.TYPE)
public @interface EzuiDataGrid{

	public String moduleName() default "";

	public boolean saveabel() default true;
	public boolean getByIdable() default true;
	public boolean updateable() default true;
	public boolean deleteable() default true;
}
