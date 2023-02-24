package com.github.encryptcase.web;

import com.github.encryptcase.utils.RsaUtil;
import com.github.encryptcase.utils.SignatureUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

/**
 * @author 尼古拉斯·亚历山大·许大仙
 * @version 1.0
 * @since 2023-02-22 16:22
 */
@Api(tags = "购物模块")
@RestController
public class ShoppingController {

    @ApiOperation(value = "购物")
    @PostMapping(value = "/buy")
    public String buy(Integer price, Integer num, String signature) {
        try {
            // 获取公钥
            PublicKey publicKey = RsaUtil.getPublicKey("RSA", "id_rsa.pub");
            // 校验数字签名
            boolean b = SignatureUtil.verifySignature(String.valueOf(num).concat(String.valueOf(price)), "SHA256withRSA", publicKey, signature);
            if (b) {
                return "购物成功(*^▽^*)";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "购物失败o(╥﹏╥)o";
    }

}
