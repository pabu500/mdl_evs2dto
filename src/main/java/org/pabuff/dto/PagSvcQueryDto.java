package org.pabuff.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class PagSvcQueryDto {
    private final PagSvcClaimDto svcClaimDto;
    private final Object request;
}
