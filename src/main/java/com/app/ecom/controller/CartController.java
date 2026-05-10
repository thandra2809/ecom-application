package com.app.ecom.controller;


import com.app.ecom.dto.CartItemRequest;
import com.app.ecom.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

//    @PostMapping
//    public ResponseEntity<Void> addProductToCart(@RequestHeader("X-User-ID") String userId, @RequestBody CartItemRequest cartItemRequest) {
//        CartDTO cartDTO = cartService.addToCart(userId, cartItemRequest);
//        return new ResponseEntity<CartDTO>(cartDTO, HttpStatus.CREATED);
//    }

//    @Autowired
//    private CartRepository cartRepository;

//    @Autowired
//    private CartService cartService;
//
//    @PostMapping("/cart/create")
//    public ResponseEntity<String> createOrUpdateCart(@RequestBody List<CartItemDTO> cartItems){
//        String response = cartService.createOrUpdateCartWithItems(cartItems);
//        return new ResponseEntity<>(response, HttpStatus.CREATED);
//    }
//
//    @PostMapping("/carts/products/{productId}/quantity/{quantity}")
//    public ResponseEntity<CartDTO> addProductToCart(@PathVariable Long productId,
//                                                    @PathVariable Integer quantity){
//        CartDTO cartDTO = cartService.addProductToCart(productId, quantity);
//        return new ResponseEntity<CartDTO>(cartDTO, HttpStatus.CREATED);
//    }
//
//    @GetMapping("/carts")
//    public ResponseEntity<List<CartDTO>> getCarts() {
//        List<CartDTO> cartDTOs = cartService.getAllCarts();
//        return new ResponseEntity<List<CartDTO>>(cartDTOs, HttpStatus.FOUND);
//    }
//
//    @GetMapping("/carts/users/cart")
//    public ResponseEntity<CartDTO> getCartById(){
//        String emailId = authUtil.loggedInEmail();
//        Cart cart = cartRepository.findCartByEmail(emailId);
//        Long cartId = cart.getCartId();
//        CartDTO cartDTO = cartService.getCart(emailId, cartId);
//        return new ResponseEntity<CartDTO>(cartDTO, HttpStatus.OK);
//    }
//
//    @PutMapping("/cart/products/{productId}/quantity/{operation}")
//    public ResponseEntity<CartDTO> updateCartProduct(@PathVariable Long productId,
//                                                     @PathVariable String operation) {
//
//        CartDTO cartDTO = cartService.updateProductQuantityInCart(productId,
//                operation.equalsIgnoreCase("delete") ? -1 : 1);
//
//        return new ResponseEntity<CartDTO>(cartDTO, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/carts/{cartId}/product/{productId}")
//    public ResponseEntity<String> deleteProductFromCart(@PathVariable Long cartId,
//                                                        @PathVariable Long productId) {
//        String status = cartService.deleteProductFromCart(cartId, productId);
//
//        return new ResponseEntity<String>(status, HttpStatus.OK);
//    }
}