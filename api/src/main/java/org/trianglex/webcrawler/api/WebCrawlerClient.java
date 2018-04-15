package org.trianglex.webcrawler.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.trianglex.webcrawler.api.dto.DemoDTO;

import static org.trianglex.webcrawler.api.constant.ApiConstant.SERVICE_NAME;

@FeignClient(SERVICE_NAME)
public interface WebCrawlerClient {

    @ResponseBody
    @PostMapping("/test")
    String test(@RequestBody DemoDTO demoDTO);
}
