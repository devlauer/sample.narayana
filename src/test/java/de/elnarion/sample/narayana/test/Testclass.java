package de.elnarion.sample.narayana.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.elnarion.sample.narayana.impl.ServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/springconfig.xml" })
public class Testclass {

	public Testclass() {
	}

	public ServiceImpl getServiceImpl() {
		return serviceImpl;
	}

	public void setServiceImpl(ServiceImpl serviceImpl) {
		this.serviceImpl = serviceImpl;
	}

	@Inject
	private ServiceImpl serviceImpl;

	@Test
	public void testSomething()
	{
		serviceImpl.doSomething();
	}
}
