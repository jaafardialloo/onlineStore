package org.onlineShop.application.mapper;

import org.onlineShop.application.dto.ItemDTO;
import org.onlineShop.domain.order.model.Item;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemDTO toDTO(Item item);

    Item toModel(ItemDTO itemDTO);

    List<ItemDTO> toDTOs(List<Item> items);
    List<Item> toModels(List<ItemDTO> itemDTOs);
}
