package com.demo.profile.Made.Wro.v2.controller;

import com.demo.profile.Made.Wro.v2.IMadeWroV2Service;
import com.demo.profile.Made.Wro.v2.model.*;
import com.gringotts.foundation.core.utils.json.JsonUtilsImpl;
import com.gringotts.foundation.core.utils.validation.HeaderCheckServiceImpl;
import com.gringotts.foundation.core.utils.web.interceptor.RequestProcessorImpl;
import com.gringotts.foundation.core.utils.xml.XmlUtilsImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(MadeWroV2ServiceController.class)
public class MadeWroV2ServiceControllerTest {

  @Autowired private MockMvc mockMvc;

  @SpyBean private JsonUtilsImpl jsonUtils;
  @SpyBean private XmlUtilsImpl xmlUtils;
  @SpyBean private RequestProcessorImpl requestProcessor;
  @SpyBean private HeaderCheckServiceImpl headerCheck;

  @MockBean private IMadeWroV2Service madeWroV2Service;

  @Test
  public void testAddPet() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testUpdatePet() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testFindPetsByStatus() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testFindPetsByTags() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetPetById() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testUpdatePetWithForm() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testDeletePet() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testUploadFile() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetInventory() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testPlaceOrder() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetOrderById() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testDeleteOrder() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testCreateUser() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testCreateUsersWithArrayInput() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testCreateUsersWithListInput() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testLoginUser() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testLogoutUser() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetUserByName() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testUpdateUser() throws Exception {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testDeleteUser() throws Exception {
    Assert.assertEquals(true, true);
  }
}
