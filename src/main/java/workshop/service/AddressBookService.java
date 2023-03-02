package workshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import workshop.model.Contact;
import workshop.repository.AddressBookRepository;

@Service
public class AddressBookService {
  @Autowired
  private AddressBookRepository adbkRepo;

  public void save(final Contact ctc) {
    adbkRepo.save(ctc);
  };

  public Contact findById(final String contactId) {
    return adbkRepo.findById(contactId);
  };

  public List<Contact> findAll(int startIndex) {
    return adbkRepo.findAll(startIndex);
  };
}
