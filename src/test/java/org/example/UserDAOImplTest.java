package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOImplTest {

    UserDAOImpl userDAO;
    @BeforeEach
    void setUp() {
        userDAO = new UserDAOImpl();
    }

    @Test
    void testAddUser() {
        //Arrange
        User newUser = new User("jermaine", "tucker", "admin","admin");
        //Act
        String actualResult = userDAO.addUser(newUser);
        //Assert
        assertEquals("new user added", actualResult);

    }
}