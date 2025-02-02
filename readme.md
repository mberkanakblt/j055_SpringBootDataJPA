1.GET:

Amaç: Sunucudan belirli bir kaynağı (örneğin, bir web sayfası, bir resim 
veya bir veri dosyası) almak için kullanılır.
Özellikleri:
Genellikle veri almak için kullanılır.
İstek parametreleri URL'de yer alır.
Önbelleğe alınabilir.

@GetMapping
public List<Product> getAllProducts(){
return productService.getAllProducts();
}

veya

@GetMapping("/id")
public Optional<Product> getProductById(Long id){
return productService.getProductById(id);
}

2.POST:

Amaç: Sunucuya veri göndermek için kullanılır (örneğin, bir form göndermek, 
bir dosya yüklemek veya yeni bir kaynak oluşturmak).
Özellikleri:
Genellikle veri göndermek için kullanılır.
İstek parametreleri istek gövdesinde (body) yer alır.
Önbelleğe alınamaz.
Güvenli bir yöntem değildir (veri üzerinde değişiklik yapabilir).
Örnek: Bir web sitesinde bir formu doldurup gönderdiğinizde, tarayıcınız bir POST isteği gönderir.


@PostMapping
public Product createProduct(Product product){
return productService.createProduct(product);
}


3.PUT:

Amaç: Sunucudaki mevcut bir kaynağı güncellemek veya yeni bir kaynak oluşturmak için kullanılır.
Özellikleri:
Genellikle veri güncellemek veya yeni bir kaynak oluşturmak için kullanılır.
İstek parametreleri istek gövdesinde (body) yer alır.
Önbelleğe alınamaz.
Güvenli bir yöntem değildir (veri üzerinde değişiklik yapabilir).
Örnek: Bir web sitesinde profil bilgilerinizi düzenleyip kaydettiğinizde, 
tarayıcınız bir PUT isteği gönderebilir.


@PutMapping("/id")
public Product updateProduct( Long id,Product product) {
return productService.updateProduct(id, product);
}


4.DELETE:

Amaç: Sunucudaki belirli bir kaynağı silmek için kullanılır.
Özellikleri:
Genellikle veri silmek için kullanılır.
Önbelleğe alınamaz.
Güvenli bir yöntem değildir (veri üzerinde değişiklik yapabilir).
Örnek: Bir web sitesinde bir gönderiyi sildiğinizde, tarayıcınız bir DELETE isteği gönderebilir.

@DeleteMapping("/{id}")
public void deleteProduct(Long id) {
productService.deleteProduct(id);
}


Diğer HTTP İstek Türleri

HEAD: GET isteğine benzer, ancak yalnızca başlık bilgilerini alır (gövdeyi almaz).
OPTIONS: Sunucunun hangi HTTP yöntemlerini desteklediğini öğrenmek için kullanılır.
CONNECT: Bir proxy sunucusu üzerinden tünel oluşturmak için kullanılır.
TRACE: İstek zinciri boyunca mesajları izlemek için kullanılır.
PATCH: Kaynağın kısmi olarak değiştirilmesi için kullanılır.