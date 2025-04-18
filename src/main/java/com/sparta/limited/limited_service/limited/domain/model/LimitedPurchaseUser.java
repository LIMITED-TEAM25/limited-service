package com.sparta.limited.limited_service.limited.domain.model;

import com.sparta.limited.common_module.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "p_limited_event_user")
public class LimitedPurchaseUser extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "limited_event_id", nullable = false)
    private UUID limitedEventId;


    private LimitedPurchaseUser(Long userId, UUID limitedEventId) {
        this.userId = userId;
        this.limitedEventId = limitedEventId;
    }

    public static LimitedPurchaseUser of(Long userId, UUID limitedEventId) {
        return new LimitedPurchaseUser(userId, limitedEventId);
    }
}
