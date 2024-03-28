package br.com.camilaferreiranas.saveyourlink.entity.dto;

import java.util.UUID;

public record CreateLinkRequest(String title, String link, UUID userId) {
}
