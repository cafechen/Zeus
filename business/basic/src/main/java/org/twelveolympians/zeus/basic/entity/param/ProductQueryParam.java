package org.twelveolympians.zeus.basic.entity.param;

import org.twelveolympians.zeus.basic.entity.po.Product;
import org.twelveolympians.zeus.common.web.entity.param.BaseParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductQueryParam extends BaseParam<Product> {
    private String name;
}
