package com.datalook.ezui.annotation.page;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.datalook.ezui.annotation.element.EzuiElement;

@Documented 
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.TYPE)
public @interface EzuiDataGrid{
}
