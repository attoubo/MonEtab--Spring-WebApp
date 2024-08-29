package ci.digitalacademy.monetab.service.impl;

import ci.digitalacademy.monetab.models.Address;
import ci.digitalacademy.monetab.repositories.AdressRepository;
import ci.digitalacademy.monetab.service.AdressService;
import ci.digitalacademy.monetab.service.dto.AddressDTO;
import ci.digitalacademy.monetab.service.mapper.AddressMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class AdressServiceImpl implements AdressService {

    private final  AdressRepository adressRepository;

    @Override
    public AddressDTO save(AddressDTO addressDTO) {
        log.debug("Saving address: {}", addressDTO);
        Address address = AddressMapper.toEntity(addressDTO);
        address = adressRepository.save(address);
        return AddressMapper.toDto(address);
    }

    @Override
    public AddressDTO update(AddressDTO addressDTO) {
        return findOne(addressDTO.getId()).map(existingAddress->{
            existingAddress.setCountry(addressDTO.getCountry());
            existingAddress.setStreet(addressDTO.getStreet());
            return save(addressDTO);
        }).orElseThrow(()->new IllegalArgumentException());
    }

    @Override
    public Optional<AddressDTO> findOne(Long id) {
        return adressRepository.findById(id).map(address -> {
            return AddressMapper.toDto(address);
        });
    }

    @Override
    public List<AddressDTO> findAll() {
        return adressRepository.findAll().stream().map(address -> {
            return AddressMapper.toDto(address);
        }).toList();
    }

    public void deleteById(Long id) {

    }
}
