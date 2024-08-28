package ci.digitalacademy.monetab.service;

import ci.digitalacademy.monetab.service.dto.AddressDTO;

import java.util.List;
import java.util.Optional;

public interface AdressService {

    AddressDTO save(AddressDTO address);
    AddressDTO update(AddressDTO address);
    Optional<AddressDTO> findOne(Long id);
    List<AddressDTO> findAll();
    void deleteById(Long id);


}
