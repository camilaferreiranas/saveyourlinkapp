package br.com.camilaferreiranas.saveyourlink.entity.dto;

import java.time.Instant;

public record LoginResponse(String accessToken, Instant expiresIn) {
}
