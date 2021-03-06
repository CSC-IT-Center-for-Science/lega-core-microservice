package eu.crg.ega.microservice.dto.auth;

import org.joda.time.DateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Builder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Session {

  private String sessionToken;

  private DateTime expeditionTime;

  private DateTime expirationTime;

  private String method = "N/A";

  private String ipAddress;
  
  private DateTime latestLogin;

}
