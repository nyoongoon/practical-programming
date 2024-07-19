package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantChainService {
    private final StoreRepository storeRepository;

    public long calculateRevenue(long restaurantId) {
        Long<Store> stores = storeRepository.findByRestaurantId(restaurantId);
        long revenue = 0;
        for (Store store : stores) {
            revenue += store.calculateRevenue();
        }
        return revenue;
    }
}
