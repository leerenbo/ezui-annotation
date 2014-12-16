package com.datalook.ezui.annotation.element;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface EzuiElement {
	// 控件前文字
	public String title() default "";

	// //页面id
	// public int pageId() default 0;
	// 控件类型
	public EzuiElementType elementType() default EzuiElementType.Default;

	public enum EzuiElementType {// combo, combobox, datetimespinner,
									// validatebox, spinner,numberspinner,
		combogrid, combobox, datebox, datetimebox, numberbox, textbox, timespinner, tree, treegrid, Default
	}

	// //顺序
	// public int orderInPage() default 0;
	// 控件是否隐藏
	public boolean isHidden() default false;

	// 默认值
	public String defaultValue() default "";

	// json格式化标识对象如{"1":"正常","0":"删除"}，添加到数据库字典表。
	public String formatString() default "";

	// list对象有relate功能时，在页面上按钮的名称
	public String buttonText() default "";

	// 如果有多个T类型的List<T>，relate无法自动关联，需要指定关联哪一个List对象。
	public String relatedCollectionName() default "";

	// 控件中，选中id后，显示的对应text键的值对应的fieldName
	public String textField() default "";

	// 显示的选择的id
	public String idField() default "";

	// tree模型中，父id的fieldName
	public String parentField() default "";

	public EzuiDataOptions dataOptions() default @EzuiDataOptions;

}
