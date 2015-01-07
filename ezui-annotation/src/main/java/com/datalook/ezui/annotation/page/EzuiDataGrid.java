package com.datalook.ezui.annotation.page;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EzuiDataGrid {

	public String moduleName() default "";

	public boolean saveabel() default true;

	public boolean getByIdable() default true;

	public boolean updateable() default true;

	public boolean deleteable() default true;

	public boolean downloadExcelable() default false;

	public boolean uploadExcelable() default false;
	// //显示行号
	// public boolean rownumbers() default false;
	// //单选
	// public boolean singleSelect() default true;
	// //选择时，被选中
	// public boolean checkOnSelect() default true;
	// public boolean selectOnCheck() default true;
	//
	// //分页信息位置
	// public PagePosition pagePosition() default PagePosition.bottom;
	// public enum PagePosition{
	// top,bottom,both
	// }
	// //分页大小
	// public int pageSize() default 10;
	// //可选分页
	// public int[] pageList() default {10,20,30,40,50};
	// //排序的name属性
	// public String sortName() default "";
	//
	// public SortOrder sortOrder() default SortOrder.asc;
	// public enum SortOrder{
	// asc,desc
	// }

}
