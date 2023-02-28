package es.codeurjc.mca.events.image;

import java.io.File;
import java.io.IOException;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.DeleteObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectAclResponse;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

@Service("storageService")
@Profile("production")
public class S3ImageService implements ImageService {

    public static S3Client s3;

    public S3ImageService() {
        s3 = S3Client.builder()
                .region(Region.EU_WEST_1)
                .build();
    }

    private String bucketName = "mca.practicas";

    @Override
    public String createImage(MultipartFile multiPartFile) {
        String fileName = multiPartFile.getOriginalFilename();
        File file = new File(System.getProperty("java.io.tmpdir")+"/"+fileName);
        //multiPartFile.transferTo(file);
        s3.putObject(
            PutObjectRequest.builder()
                .bucket(bucketName)
                .key(fileName)
                .build(), 
            RequestBody.fromFile(file)
        );
        return fileName;
    }

    @Override
    public void deleteImage(String image) {
        s3.deleteObject(
                DeleteObjectRequest.builder()
                        .bucket(bucketName)
                        .key(image)
                        .build());

    }

}
