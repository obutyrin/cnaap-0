package com.demo.profile.Made.Wro.v2.controller;

import com.demo.profile.Made.Wro.v2.IMadeWroV2Service;
import com.demo.profile.Made.Wro.v2.model.*;
import com.gringotts.foundation.core.utils.validation.CreateGroup;
import com.gringotts.foundation.core.utils.validation.UpdateGroup;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/** */
@RestController
@Api("swagger-petstore")
@RequiredArgsConstructor
public class MadeWroV2ServiceController implements IMadeWroV2ServiceController {

  private final IMadeWroV2Service madeWroV2Service;

  /** */
  @Override
  public ResponseEntity<Void> addPet(
      @ApiParam(value = "Pet object that needs to be added to the store", required = true)
          @Validated({CreateGroup.class})
          @RequestBody
          Pet body) {

    madeWroV2Service.addPet(body);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  /** */
  @Override
  public ResponseEntity<Void> updatePet(
      @ApiParam(value = "Pet object that needs to be added to the store", required = true)
          @Validated({UpdateGroup.class})
          @RequestBody
          Pet body) {

    madeWroV2Service.updatePet(body);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  /** */
  @Override
  public ResponseEntity<List<Pet>> findPetsByStatus(
      @ApiParam(value = "Status values that need to be considered for filter", required = true)
          @RequestParam(value = "status", required = true)
          List<String> status) {

    List<Pet> data = madeWroV2Service.findPetsByStatus();
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }

  /** */
  @Override
  public ResponseEntity<List<Pet>> findPetsByTags(
      @ApiParam(value = "Tags to filter by", required = true)
          @RequestParam(value = "tags", required = true)
          List<String> tags) {

    List<Pet> data = madeWroV2Service.findPetsByTags();
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }

  /** */
  @Override
  public ResponseEntity<Pet> getPetById(
      @ApiParam(value = "ID of pet to return", required = true)
          @PathVariable(value = "petId", required = true)
          Long petId) {

    Pet data = madeWroV2Service.getPetById(petId);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }

  /** */
  @Override
  public ResponseEntity<Void> updatePetWithForm(
      @ApiParam(value = "ID of pet that needs to be updated", required = true)
          @PathVariable(value = "petId", required = true)
          Long petId,
      @ApiParam(value = "Updated name of the pet", required = false) String name,
      @ApiParam(value = "Updated status of the pet", required = false) String status) {

    madeWroV2Service.updatePetWithForm(petId, name, status);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  /** */
  @Override
  public ResponseEntity<Void> deletePet(
      @RequestHeader(value = "api_key", required = false) String api_key,
      @ApiParam(value = "Pet id to delete", required = true)
          @PathVariable(value = "petId", required = true)
          Long petId) {

    madeWroV2Service.deletePet(petId);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  /** */
  @Override
  public ResponseEntity<ModelApiResponse> uploadFile(
      @ApiParam(value = "ID of pet to update", required = true)
          @PathVariable(value = "petId", required = true)
          Long petId,
      @ApiParam(value = "Additional data to pass to server", required = false)
          String additionalMetadata,
      @ApiParam(value = "file to upload", required = false) MultipartFile file) {

    ModelApiResponse data = madeWroV2Service.uploadFile(petId, additionalMetadata, file);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  /** */
  @Override
  public ResponseEntity<Object> getInventory() {

    Object data = madeWroV2Service.getInventory();
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  /** */
  @Override
  public ResponseEntity<Order> placeOrder(
      @ApiParam(value = "order placed for purchasing the pet", required = true)
          @Validated({CreateGroup.class})
          @RequestBody
          Order body) {

    Order data = madeWroV2Service.placeOrder(body);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }

  /** */
  @Override
  public ResponseEntity<Order> getOrderById(
      @ApiParam(value = "ID of pet that needs to be fetched", required = true)
          @PathVariable(value = "orderId", required = true)
          Long orderId) {

    Order data = madeWroV2Service.getOrderById(orderId);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }

  /** */
  @Override
  public ResponseEntity<Void> deleteOrder(
      @ApiParam(value = "ID of the order that needs to be deleted", required = true)
          @PathVariable(value = "orderId", required = true)
          Long orderId) {

    madeWroV2Service.deleteOrder(orderId);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  /** */
  @Override
  public ResponseEntity<Void> createUser(
      @ApiParam(value = "Created user object", required = true)
          @Validated({CreateGroup.class})
          @RequestBody
          User body) {

    madeWroV2Service.createUser(body);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  /** */
  @Override
  public ResponseEntity<Void> createUsersWithArrayInput(
      @ApiParam(value = "List of user object", required = true)
          @Validated({CreateGroup.class})
          @RequestBody
          List<User> body) {

    madeWroV2Service.createUsersWithArrayInput(body);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  /** */
  @Override
  public ResponseEntity<Void> createUsersWithListInput(
      @ApiParam(value = "List of user object", required = true)
          @Validated({CreateGroup.class})
          @RequestBody
          List<User> body) {

    madeWroV2Service.createUsersWithListInput(body);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  /** */
  @Override
  public ResponseEntity<String> loginUser(
      @ApiParam(value = "The user name for login", required = true)
          @RequestParam(value = "username", required = true)
          String username,
      @ApiParam(value = "The password for login in clear text", required = true)
          @RequestParam(value = "password", required = true)
          String password) {

    String data = madeWroV2Service.loginUser();
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }

  /** */
  @Override
  public ResponseEntity<Void> logoutUser() {

    madeWroV2Service.logoutUser();
    return new ResponseEntity<>(HttpStatus.OK);
  }

  /** */
  @Override
  public ResponseEntity<User> getUserByName(
      @ApiParam(
              value = "The name that needs to be fetched. Use user1 for testing. ",
              required = true)
          @PathVariable(value = "username", required = true)
          String username) {

    User data = madeWroV2Service.getUserByName(username);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }

  /** */
  @Override
  public ResponseEntity<Void> updateUser(
      @ApiParam(value = "name that need to be updated", required = true)
          @PathVariable(value = "username", required = true)
          String username,
      @ApiParam(value = "Updated user object", required = true)
          @Validated({UpdateGroup.class})
          @RequestBody
          User body) {

    madeWroV2Service.updateUser(username, body);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  /** */
  @Override
  public ResponseEntity<Void> deleteUser(
      @ApiParam(value = "The name that needs to be deleted", required = true)
          @PathVariable(value = "username", required = true)
          String username) {

    madeWroV2Service.deleteUser(username);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
