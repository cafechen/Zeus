package org.twelveolympians.zeus.auth.entity.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.twelveolympians.zeus.common.web.entity.form.BaseForm;
import org.twelveolympians.zeus.auth.entity.po.Product;

import javax.validation.constraints.NotBlank;

@ApiModel
@Data
public class ProductForm extends BaseForm<Product> {

    @NotBlank(message = "产品名称不能为空")
    @ApiModelProperty(value = "产品名称")
    private String name;

    @ApiModelProperty(value = "产品描述")
    private String description;
}
