package org.example.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class MockitoTests {

    @Mock
    Database databaseMock;

    Employee employee;

    @BeforeEach
    void init() {
        employee = new Employee("John Doe", databaseMock);
    }

    /**
     * Test if a certain method is called by mocking the corresponding object and use apply Mockito.verify(<mock>)
     */
    @Test
    void testMethodInvocation () {

        //given that the mock behaves in a certain way
        given(databaseMock.querySalary(anyString())).willReturn(2345.6);

        //when the tested function is executed
        String salary = employee.getSalary();

        //ensure that the tested method called the function
        verify(databaseMock).querySalary(anyString());
    }
}