package com.example.profile.Dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "account")
public record AccountsContectInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {


}
