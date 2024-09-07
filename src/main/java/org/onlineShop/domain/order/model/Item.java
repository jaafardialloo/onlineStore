package org.onlineShop.domain.order.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item")
@Getter
@Setter
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private Double price;
    @NotNull
    private Double quantity;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    public boolean isValid() {
        return price > 0 && quantity > 0;
    }
}
