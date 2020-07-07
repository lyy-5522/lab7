package one;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class UITest {

	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testInitialize() {
		UI ui=EasyMock.createMock(UI.class);
		ui.initialize();
		EasyMock.expectLastCall().anyTimes();
		EasyMock.replay(ui);
		EasyMock.verify(ui);
	}

	@Test
	public void testDraw_color() {
		UI ui=EasyMock.createMock(UI.class);
		ui.Draw_color(10, 10);
		EasyMock.expectLastCall().anyTimes();
		EasyMock.replay(ui);
		EasyMock.verify(ui);
	}

}
