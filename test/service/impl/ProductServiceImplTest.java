package service.impl;

import entities.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.ProductService;
import service.ShoppingCart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ProductServiceImplTest {
    @Test
    @DisplayName("Prueba para agregar un nuevo producto al carrito")
    public void testAddProductToCart(){
        //GIVEN
        //Generamos un mock del carrito
        ShoppingCart cartMock = mock(ShoppingCart.class);
        ProductService productService = new ProductServiceImpl(cartMock);
        Product product = new Product("Example Product", 10.0);
        int quantity = 3;

        //WHEN
        productService.addProductToCart(product, quantity);

        //THEN
        //Verificamos que el metodo para agregar productos suceda al menos una vez
        verify(cartMock, times(quantity)).addProduct(product);

    }
    @Test
    @DisplayName("Prueba para recuperar la cantidad total de productos en el carrito")
    public void getAllProductsFromCart() {
        //GIVEN
        ProductService productService = mock(ProductServiceImpl.class);
        int quantity = 2;
        //Con el metodo when, hacemos una simulacion forzada
        // de lo que esperamos que suceda cuando se ejecute el metodo principal
        when(productService.getAllProductsFromCart()).thenReturn(2);

        //WHEN
        int result = productService.getAllProductsFromCart();

        //THEN
        assertEquals(quantity, result);
        verify(productService, times(1)).getAllProductsFromCart();
    }
}
