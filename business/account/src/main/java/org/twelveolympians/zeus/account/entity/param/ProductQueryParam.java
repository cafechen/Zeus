package org.twelveolympians.zeus.account.entity.param;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.twelveolympians.zeus.account.entity.po.Product;
import org.twelveolympians.zeus.common.web.entity.param.BaseParam;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductQueryParam extends BaseParam<Product> {
    private String name;
}
