package com.demo.profile.Made.Wro.v2.delegator;

import com.demo.profile.Made.Wro.v2.IMadeWroV2Service;
import com.demo.profile.Made.Wro.v2.helper.IMadeWroV2ServiceHelper;
import com.demo.profile.Made.Wro.v2.model.ModelApiResponse;
import com.demo.profile.Made.Wro.v2.model.Order;
import com.demo.profile.Made.Wro.v2.model.Pet;
import com.demo.profile.Made.Wro.v2.model.User;
import com.gringotts.foundation.core.utils.execution.ServiceExecutionContextUtil;
import com.gringotts.foundation.core.utils.future.FutureUtils;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
@RequiredArgsConstructor
public class MadeWroV2ServiceDelegator implements IMadeWroV2Service, ServiceExecutionContextUtil {
  private final FutureUtils futureUtils;

  private final IMadeWroV2ServiceHelper madeWroV2ServiceHelper;

  @Override
  public void addPet(Pet body) {
    madeWroV2ServiceHelper.processAddPetRequest();
    madeWroV2ServiceHelper.processAddPetResponse();
  }

  @Override
  public void updatePet(Pet body) {
    madeWroV2ServiceHelper.processUpdatePetRequest();
    madeWroV2ServiceHelper.processUpdatePetResponse();
  }

  @Override
  public List<Pet> findPetsByStatus() {
    madeWroV2ServiceHelper.processFindPetsByStatusRequest();
    return madeWroV2ServiceHelper.processFindPetsByStatusResponse();
  }

  @Override
  public List<Pet> findPetsByTags() {
    madeWroV2ServiceHelper.processFindPetsByTagsRequest();
    return madeWroV2ServiceHelper.processFindPetsByTagsResponse();
  }

  @Override
  public Pet getPetById(Long petId) {
    madeWroV2ServiceHelper.processGetPetByIdRequest();
    return madeWroV2ServiceHelper.processGetPetByIdResponse();
  }

  @Override
  public void updatePetWithForm(Long petId, String name, String status) {
    madeWroV2ServiceHelper.processUpdatePetWithFormRequest();
    madeWroV2ServiceHelper.processUpdatePetWithFormResponse();
  }

  @Override
  public void deletePet(Long petId) {
    madeWroV2ServiceHelper.processDeletePetRequest();
    madeWroV2ServiceHelper.processDeletePetResponse();
  }

  @Override
  public ModelApiResponse uploadFile(Long petId, String additionalMetadata, MultipartFile file) {
    madeWroV2ServiceHelper.processUploadFileRequest();
    return madeWroV2ServiceHelper.processUploadFileResponse();
  }

  @Override
  public Object getInventory() {
    madeWroV2ServiceHelper.processGetInventoryRequest();
    return madeWroV2ServiceHelper.processGetInventoryResponse();
  }

  @Override
  public Order placeOrder(Order body) {
    madeWroV2ServiceHelper.processPlaceOrderRequest();
    return madeWroV2ServiceHelper.processPlaceOrderResponse();
  }

  @Override
  public Order getOrderById(Long orderId) {
    madeWroV2ServiceHelper.processGetOrderByIdRequest();
    return madeWroV2ServiceHelper.processGetOrderByIdResponse();
  }

  @Override
  public void deleteOrder(Long orderId) {
    madeWroV2ServiceHelper.processDeleteOrderRequest();
    madeWroV2ServiceHelper.processDeleteOrderResponse();
  }

  @Override
  public void createUser(User body) {
    madeWroV2ServiceHelper.processCreateUserRequest();
    madeWroV2ServiceHelper.processCreateUserResponse();
  }

  @Override
  public void createUsersWithArrayInput(List<User> body) {
    madeWroV2ServiceHelper.processCreateUsersWithArrayInputRequest();
    madeWroV2ServiceHelper.processCreateUsersWithArrayInputResponse();
  }

  @Override
  public void createUsersWithListInput(List<User> body) {
    madeWroV2ServiceHelper.processCreateUsersWithListInputRequest();
    madeWroV2ServiceHelper.processCreateUsersWithListInputResponse();
  }

  @Override
  public String loginUser() {
    madeWroV2ServiceHelper.processLoginUserRequest();
    return madeWroV2ServiceHelper.processLoginUserResponse();
  }

  @Override
  public void logoutUser() {
    madeWroV2ServiceHelper.processLogoutUserRequest();
    madeWroV2ServiceHelper.processLogoutUserResponse();
  }

  @Override
  public User getUserByName(String username) {
    madeWroV2ServiceHelper.processGetUserByNameRequest();
    return madeWroV2ServiceHelper.processGetUserByNameResponse();
  }

  @Override
  public void updateUser(String username, User body) {
    madeWroV2ServiceHelper.processUpdateUserRequest();
    madeWroV2ServiceHelper.processUpdateUserResponse();
  }

  @Override
  public void deleteUser(String username) {
    madeWroV2ServiceHelper.processDeleteUserRequest();
    madeWroV2ServiceHelper.processDeleteUserResponse();
  }
}
