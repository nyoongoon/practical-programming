package com.example.layered;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountJpaRepository accountJpaRepository;

    @Transactional
    public Account updateNicknameById(long id, String nickname){
        //영속성 객체를 불러와 도메인 객체로 변환
        Account account = accountJpaRepository.findById(id)
                .orElseThrow(()->new NotFoundException("account", id))
                .toModel();
        //도메인 객체에 작업을 위임
        account = account.withNickname(nickname);
        //영속성 객체를 도메인 객체로 변환
        accountJpaRepository.save(AccountJpaEntity.from(account));
    }
}
