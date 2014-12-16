package com.datalook.ezui.annotation.element;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface EzuiDataOptions {

	// --------validatebox--------
	// 空时提示
	public String missingMessage() default "该输入项为必输项";

	// 验证
	public EzuiValid[] validTypes() default {};

	@Documented
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ ElementType.FIELD })
	public @interface EzuiValid {
		// 验证方式
		public ValidType type();

		// length参数0最短长度，参数1最长长度
		// remote参数0action地址，参数1action中对应的String 的fieldname。
		// regexp参数0
		public enum ValidType {
			email, url, length, remote, regexp, CharAndChinese, Char, CharAndNumber, Chinese, ChineseAndNumber, CharAndChineseAndNumber, CharBig, CharSmall
		}

		// 验证参数
		public String[] params() default {};
	}

	public boolean required() default false;

	// 验证失败
	public String invalidMessage() default "";

	// --------textbox--------[validatebox]
	// 提示
	public String prompt() default "";

	// // text文本，password密码
	// public TextboxType textBoxType() default TextboxType.Default;
	//
	// public enum TextboxType {
	// text, password, Default
	// }

	 // 是否可编辑
	 public boolean editable() default true;
	//
	// // 控件只读
	// public boolean readonly() default false;
	//
	// // 控件失效
	// public boolean disabled() default false;
	//
	// //--------combo--------[textbox,panel]
	// //多行显示
	// public boolean multiple() default false;
	//
	// //--------ComboBox--------[combo]
	// //下拉识别的value值的键
	// public String valueField() default "";

	// //下拉显示的gourp分组值的键
	// public String groupField() default "";
	// //网络获取数据
	// public String url() default "";
	// //本地数据json对象
	// public String data() default "";
	//
	//
	// //--------ComboTree--------[combo,tree]
	// //是否前面显示选项框
	// public boolean checkbox() default false;
	// //级联选择
	// public boolean cascadeCheck() default true;
	// //只在叶子节点
	// public boolean onlyLeafCheak() default false;
	// //显示连接线
	// public boolean lines() default false;
	// //url请求参数
	// public String queryParams() default "";
	//
	//
	// //--------ComboGrid--------[combo,datagrid]
	// --------numberbox--------[textbox]
	// //没三个数字分一组
	// public String groupSeparator() default "";
	// //数学小数点符号
	// public String decimalSeparator() default "";
	// //前缀
	// public String prefix() default "";
	// //后缀
	// public String suffix() default "";
	// //最小值
	// public String min() default "";
	// //最大值
	// public String max() default "";

	// //--------DateBox--------[combo,calendar]
	// public String[] buttons() default{};

}
