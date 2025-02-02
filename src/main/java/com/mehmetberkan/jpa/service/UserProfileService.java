package com.mehmetberkan.jpa.service;

import com.mehmetberkan.jpa.entity.UserProfile;
import com.mehmetberkan.jpa.repository.UserProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Dependency Injection - DI / Bağımlılıkların Enjeksiyonu
 * Spring, belli kalıplar ile ihtiyaç duyulan sınıfların nesnelerini kendi
 * sistemi ile oluşturulabilir. Yani, bir interface için ya da sınıf için
 * nesne oluşturulması gerekiyorsa kendisi oluşturur ve gerekli olan sınıflara
 * enfekte eder.
 * DİKKAT!!!!
 * yukarıdaki işlemin geçrmekleşmesi için gerekli olan 2 kavram vardır.
 * 1- Bir sınıf nasıl oluşturulur?
 * Spring ilk ayağa kalkarken @ComponentScan tüm sistemi tarar kendisine ait
 * anotasyonları olan ya da miras alınmış sınıfları tarar ve tümünün bir
 * referansını yaratır(tümünü newler) ve oluşan bir referansları Application Context
 * adını verdiği bir listenin içerisinde saklar. Bu işlem Singleton olarak yürüütülür.
 * Bu sınıfların oluşturulmasında @Bean denilen yapıyı kullanır.
 * 2- Oluşturulan bir nesne referansı başka bir sınıfa nasıl enjekte edilir?
 * -Yöntem 1: Bir değişken tanımlanır ve buna bir nesne referansı atanması gerektiğini
 * @Autowired anotasyonu ile belirtiriz.(ÖNERİLMEZ)
 * -Yöntem 2: dependency injection (constructor injection) . eğer bir değişken final
 * ise mutlaka sınıf başlatılmadan değer atanması gerekiyor.
 * Bu yöntemde, ilgili sınıfın constructorına verişkkmesi gereken nesneyi Spring Boot
 * otomatik olarak bilir ve Application Contextinin içerisinde öncesine önceden yaratmış
 * olduğu nesnenin
 *
 */

/**
 * Spring Boot genellikle kendi anotasyonları ile işaretlenmiş ya da miras alınmış
 * sınıfların Referanslarını üretir(Bean oluşturur).
 * bu sınıf için bir nesne yaratılmasını istiyorsak buna spring anotasyonu eklemeliyiz
 * @Service
 */
@Service
public class UserProfileService {
    private final UserProfileRepository userProfileRepository;

    public UserProfileService(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    public void save(UserProfile userProfile) {
        userProfileRepository.save(userProfile);
    }
    public List<UserProfile> getAll() {
        return userProfileRepository.findAll();
    }
}
