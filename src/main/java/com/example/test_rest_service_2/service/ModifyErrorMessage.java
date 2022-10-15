package com.example.test_rest_service_2.service;

import com.example.test_rest_service_2.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("ModifyErrorMessage")
public class ModifyErrorMessage implements MyModifyService {
    @Override
    public Response modify(Response response) {
        response.setErrorMessage("Ошибка. Вероятно что-то пошло не так :(");
        return response;
    }
}
