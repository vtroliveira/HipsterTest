package br.com.asap.hipster.cucumber.stepdefs;

import br.com.asap.hipster.HipsterTestApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HipsterTestApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
