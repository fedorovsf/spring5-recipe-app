package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by sergei on 29/12/2018.
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
