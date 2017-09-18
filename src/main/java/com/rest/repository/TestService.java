/**
 * 
 */
package com.rest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rest.service.TestRepository;

/**
 * @author AnudeepKumar
 *
 */
@Service("testService")
public class TestService {

	@Autowired
	@Qualifier("testRepository")
	private TestRepository testRepository;

	public void testMethod() {
		System.out.println("Method in Service");
		testRepository.testMethod();
	}

}
