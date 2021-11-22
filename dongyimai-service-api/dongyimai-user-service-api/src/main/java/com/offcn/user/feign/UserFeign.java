package com.offcn.user.feign;

import com.offcn.entity.Result;
import com.offcn.user.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "dym-user")
@RequestMapping("user")
public interface UserFeign {
    @GetMapping("/load/{username}")
    public Result<User> findByUsername(@PathVariable("username") String username);
}
