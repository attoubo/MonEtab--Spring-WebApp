package ci.digitalacademy.monetab.service.mapper;


import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.service.dto.UserDTO;

public class UserMapper {
    private UserMapper(){};

    public static UserDTO toDto(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setPseudo(user.getPseudo());
        userDTO.setPassword(user.getPassword());
        userDTO.setCreationDate(user.getCreationDate());
//        userDTO.setAddress(user.getAddress());
        return userDTO;
    }


    public static User toEntity(UserDTO userDTO){
        User user = new User();
        user.setId(userDTO.getId());
        user.setPseudo(userDTO.getPseudo());
        user.setPassword(userDTO.getPassword());
        user.setCreationDate(userDTO.getCreationDate());
//        user.setAddress(userDTO.getAddress());
        return user;
    }

}
