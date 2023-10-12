package com.demo.profile.Made.Wro.v2.delegator.config;

import com.demo.profile.Made.Wro.v2.helper.impl.MadeWroV2ServiceHelperImpl;
import com.gringotts.foundation.core.utils.future.FutureUtils;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.gringotts.foundation", "com.demo.profile.Made.Wro.v2"})
public class TestConfiguration {

  @MockBean public FutureUtils futureUtils;

  @SpyBean public MadeWroV2ServiceHelperImpl madeWroV2ServiceHelperImpl;
}
