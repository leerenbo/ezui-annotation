package com.datalook.ezui.annotation.element;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented 
@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.FIELD}) 
public @interface EzuiElement {
	//页面id
	public int pageId() default 0;
	//控件类型
	public EzuiElementType elementType() default EzuiElementType.Default;
	public enum EzuiElementType {
		Combo, Combobox, Combogrid, Combotree, Datebox, Datetimebox, Datetimespinner, Numberbox, Numberspinner, Textbox, Timebox, Timespinner, Validatebox,Default
	}
	//顺序
	public int order() default 0;
	
	
	//--------validatebox--------
	//是否必填
	public boolean required() default false;
	//空时提示
	public String missingMessage() default "该输入项为必输项";
	//验证
	public Valid[] validType() default {};
	@Documented
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD}) 
	public @interface Valid {
		//验证方式
		public ValidType type();
		public enum ValidType{
			email,url,length,remote
		}
		//验证参数
		public String param();
	}
	//验证失败
	public String invalidMessage() default "验证失败";
	
	
	//--------textbox--------[validatebox]
	//提示
	public String prompt() default "";
	//text文本，password密码
	public TextboxType type() default TextboxType.text;
	public enum TextboxType {
		text,password
	}
	//是否多行显示
	public boolean multiline() default false;
	//是否可编辑
	public boolean editable() default false;
	//控件只读
	public boolean readonly() default false;
	//控件失效
	public boolean disabled() default false;
	//默认值
	public String value() default "";
	
	//--------combo--------[textbox,panel]
	//多行显示
	public boolean multiple() default false;
	
	
	//--------ComboBox--------[combo]
	//下拉识别的value值
	public String valueField() default "";
	//下拉显示的text值。
	public String textField() default "";
	//下拉显示的gourp分组值。
	public String groupField() default "";
	//网络获取数据
	public String url() default "";
	//本地数据
	public String data() default "";
	
	
	//--------ComboTree--------[combo,tree]
	//是否前面显示选项框
	public boolean checkbox() default false;
	//级联选择
	public boolean cascadeCheck() default true;
	//只在叶子节点
	public boolean onlyLeafCheak() default false;
	//显示连接线
	public boolean lines() default false;
	//url请求参数
	public String queryParams() default "";
	
	
	//--------ComboGrid--------[combo,datagrid]

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
