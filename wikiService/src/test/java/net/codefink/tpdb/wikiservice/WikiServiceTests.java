package net.codefink.tpdb.wikiservice;

import net.codefink.tpdb.wikiservice.services.TestService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WikiServiceTests {

  @InjectMocks
  private TestService wikiService;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void testAdd() {
    assertEquals(3, wikiService.add(1, 2));
  }
}
