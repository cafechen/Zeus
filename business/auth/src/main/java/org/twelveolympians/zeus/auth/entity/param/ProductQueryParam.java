package org.twelveolympians.zeus.auth.entity.param;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.twelveolympians.zeus.common.web.entity.param.BaseParam;
import org.twelveolympians.zeus.auth.entity.po.Product;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductQueryParam extends BaseParam<Product> {
    private String name;
}
