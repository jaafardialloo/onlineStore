package org.onlineShop.domain.order.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
    private List<Item> items = new ArrayList<>();


    public void addOrderToItems() {
        this.items.forEach(item -> item.setOrder(this));
    }

    public boolean isValidOrder() {
        return this.items.stream().allMatch(Item::isValid);
    }
}
