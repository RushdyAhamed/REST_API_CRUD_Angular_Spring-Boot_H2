package com.app.intern;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.intern.Entity.Country; 

public interface CountryRepository extends JpaRepository<Country, Integer>
{  
	
}  
