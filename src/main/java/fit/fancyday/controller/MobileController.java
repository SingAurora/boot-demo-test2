package fit.fancyday.controller;

import fit.fancyday.service.MobileUserAddressService;
import fit.fancyday.service.MobileUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RequestMapping("/mobile")
@RestController
public class MobileController {
    @Autowired
    private MobileUserService mobileUserService;
    @Autowired
    private MobileUserAddressService mobileUserAddressService;

    @GetMapping("/test")
    public String test() {
        log.info("test");
        return null;
    }
}
