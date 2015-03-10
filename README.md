Hibernate-Validation 校验工具

**使用方法**

```java

ValidationResult result = ValidationUtils.validateEntity(obj); // 校验实体

ValidationResult result = ValidationUtils.validateProperty(obj,"name")//校验属性;

result.isHasErrors();//是否有错误

result.getErrorMessage();//取得错误信息

```