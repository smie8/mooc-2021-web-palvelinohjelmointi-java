/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euroshopper;

import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author samie
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShoppingCart {
    
    private Map<Item, Long> items = new HashMap<>();
    
    public double getSum() {
        return items.keySet().stream()
                .map((item) -> item.getPrice() * items.get(item))
                .reduce(0.0, (sumSoFar, cost) -> sumSoFar + cost);
    }
    
    public void addToCart(Item item) {
         items.put(item, items.getOrDefault(item, 0L) + 1);
    }
}
