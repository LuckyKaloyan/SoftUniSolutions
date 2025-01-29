package softuni.exam.service;

import org.springframework.stereotype.Service;
import softuni.exam.models.entity.LibraryMember;

import java.io.IOException;
import java.util.Optional;

@Service
public interface LibraryMemberService {

    boolean areImported();

    String readLibraryMembersFileContent() throws IOException;
	
	String importLibraryMembers() throws IOException;

}
