package typings
package actionsDashOnDashGoogleLib.actionsDashSdkDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/actions-sdk-app", "ActionsSdkApp")
@js.native
class ActionsSdkApp protected ()
  extends actionsDashOnDashGoogleLib.assistantDashAppMod.AssistantApp {
  /**
    * Constructor for ActionsSdkApp object.
    * To be used in the Actions SDK HTTP endpoint logic.
    *
    * @example
    * const ActionsSdkApp = require('actions-on-google').ActionsSdkApp;
    * const app = new ActionsSdkApp({request: request, response: response,
    *   sessionStarted:sessionStarted});
    *
    * @actionssdk
    */
  def this(options: ActionsSdkAppOptions) = this()
  def ask(inputPrompt: actionsDashOnDashGoogleLib.responseDashBuilderMod.RichResponse): expressLib.expressMod.Response | scala.Null = js.native
  def ask(
    inputPrompt: actionsDashOnDashGoogleLib.responseDashBuilderMod.RichResponse,
    dialogState: js.Object
  ): expressLib.expressMod.Response | scala.Null = js.native
  def ask(inputPrompt: actionsDashOnDashGoogleLib.responseDashBuilderMod.SimpleResponse): expressLib.expressMod.Response | scala.Null = js.native
  def ask(
    inputPrompt: actionsDashOnDashGoogleLib.responseDashBuilderMod.SimpleResponse,
    dialogState: js.Object
  ): expressLib.expressMod.Response | scala.Null = js.native
  /**
    * Asks to collect user's input; all user's queries need to be sent to the app.
    * {@link https://developers.google.com/actions/policies/general-policies#user_experience|
    *     The guidelines when prompting the user for a response must be followed at all times}.
    *
    * @example
    * const app = new ActionsSdkApp({request: request, response: response});
    *
    * const noInputs = [
    *   `I didn't hear a number`,
    *   `If you're still there, what's the number?`,
    *   'What is the number?'
    * ];
    *
    * function mainIntent (app) {
    *   const ssml = '<speak>Hi! <break time="1"/> ' +
    *     'I can read out an ordinal like ' +
    *     '<say-as interpret-as="ordinal">123</say-as>. Say a number.</speak>';
    *   const inputPrompt = app.buildInputPrompt(true, ssml, noInputs);
    *   app.ask(inputPrompt);
    * }
    *
    * function rawInput (app) {
    *   if (app.getRawInput() === 'bye') {
    *     app.tell('Goodbye!');
    *   } else {
    *     const ssml = '<speak>You said, <say-as interpret-as="ordinal">' +
    *       app.getRawInput() + '</say-as></speak>';
    *     const inputPrompt = app.buildInputPrompt(true, ssml, noInputs);
    *     app.ask(inputPrompt);
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(app.StandardIntents.MAIN, mainIntent);
    * actionMap.set(app.StandardIntents.TEXT, rawInput);
    *
    * app.handleRequest(actionMap);
    *
    * @param inputPrompt Holding initial and
    *     no-input prompts.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by App.
    * @return The response that is sent to Assistant to ask user to provide input.
    * @actionssdk
    */
  def ask(inputPrompt: js.Object): expressLib.expressMod.Response | scala.Null = js.native
  def ask(inputPrompt: js.Object, dialogState: js.Object): expressLib.expressMod.Response | scala.Null = js.native
  def askWithCarousel(
    inputPrompt: actionsDashOnDashGoogleLib.responseDashBuilderMod.RichResponse,
    carousel: actionsDashOnDashGoogleLib.responseDashBuilderMod.Carousel
  ): expressLib.expressMod.Response | scala.Null = js.native
  def askWithCarousel(
    inputPrompt: actionsDashOnDashGoogleLib.responseDashBuilderMod.RichResponse,
    carousel: actionsDashOnDashGoogleLib.responseDashBuilderMod.Carousel,
    dialogState: js.Object
  ): expressLib.expressMod.Response | scala.Null = js.native
  def askWithCarousel(
    inputPrompt: actionsDashOnDashGoogleLib.responseDashBuilderMod.SimpleResponse,
    carousel: actionsDashOnDashGoogleLib.responseDashBuilderMod.Carousel
  ): expressLib.expressMod.Response | scala.Null = js.native
  def askWithCarousel(
    inputPrompt: actionsDashOnDashGoogleLib.responseDashBuilderMod.SimpleResponse,
    carousel: actionsDashOnDashGoogleLib.responseDashBuilderMod.Carousel,
    dialogState: js.Object
  ): expressLib.expressMod.Response | scala.Null = js.native
  /**
    * Asks to collect user's input with a carousel.
    *
    * @example
    * const app = new ActionsSdkApp({request, response});
    *
    * function welcomeIntent (app) {
    *   app.askWithCarousel('Which of these looks good?',
    *     app.buildCarousel()
    *      .addItems([
    *        app.buildOptionItem(SELECTION_KEY_ONE,
    *          ['synonym of KEY_ONE 1', 'synonym of KEY_ONE 2'])
    *          .setTitle('Number one'),
    *        app.buildOptionItem(SELECTION_KEY_TWO,
    *          ['synonym of KEY_TWO 1', 'synonym of KEY_TWO 2'])
    *          .setTitle('Number two'),
    *      ]));
    * }
    *
    * function optionIntent (app) {
    *   if (app.getSelectedOption() === SELECTION_KEY_ONE) {
    *     app.tell('Number one is a great choice!');
    *   } else {
    *     app.tell('Number two is a great choice!');
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(app.StandardIntents.TEXT, welcomeIntent);
    * actionMap.set(app.StandardIntents.OPTION, optionIntent);
    * app.handleRequest(actionMap);
    *
    * @param inputPrompt Holding initial and
    *     no-input prompts. Cannot contain basic card.
    * @param carousel Carousel built with
    *      {@link AssistantApp#buildCarousel|buildCarousel}.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant.
    * @return The response that is sent to Assistant to ask user to provide input.
    * @actionssdk
    */
  def askWithCarousel(inputPrompt: js.Object, carousel: actionsDashOnDashGoogleLib.responseDashBuilderMod.Carousel): expressLib.expressMod.Response | scala.Null = js.native
  def askWithCarousel(
    inputPrompt: js.Object,
    carousel: actionsDashOnDashGoogleLib.responseDashBuilderMod.Carousel,
    dialogState: js.Object
  ): expressLib.expressMod.Response | scala.Null = js.native
  def askWithList(
    inputPrompt: actionsDashOnDashGoogleLib.responseDashBuilderMod.RichResponse,
    list: actionsDashOnDashGoogleLib.responseDashBuilderMod.List
  ): expressLib.expressMod.Response | scala.Null = js.native
  def askWithList(
    inputPrompt: actionsDashOnDashGoogleLib.responseDashBuilderMod.RichResponse,
    list: actionsDashOnDashGoogleLib.responseDashBuilderMod.List,
    dialogState: js.Object
  ): expressLib.expressMod.Response | scala.Null = js.native
  def askWithList(
    inputPrompt: actionsDashOnDashGoogleLib.responseDashBuilderMod.SimpleResponse,
    list: actionsDashOnDashGoogleLib.responseDashBuilderMod.List
  ): expressLib.expressMod.Response | scala.Null = js.native
  def askWithList(
    inputPrompt: actionsDashOnDashGoogleLib.responseDashBuilderMod.SimpleResponse,
    list: actionsDashOnDashGoogleLib.responseDashBuilderMod.List,
    dialogState: js.Object
  ): expressLib.expressMod.Response | scala.Null = js.native
  /**
    * Asks to collect user's input with a list.
    *
    * @example
    * const app = new ActionsSdkApp({request, response});
    *
    * function welcomeIntent (app) {
    *   app.askWithList('Which of these looks good?',
    *     app.buildList('List title')
    *      .addItems([
    *        app.buildOptionItem(SELECTION_KEY_ONE,
    *          ['synonym of KEY_ONE 1', 'synonym of KEY_ONE 2'])
    *          .setTitle('Number one'),
    *        app.buildOptionItem(SELECTION_KEY_TWO,
    *          ['synonym of KEY_TWO 1', 'synonym of KEY_TWO 2'])
    *          .setTitle('Number two'),
    *      ]));
    * }
    *
    * function optionIntent (app) {
    *   if (app.getSelectedOption() === SELECTION_KEY_ONE) {
    *     app.tell('Number one is a great choice!');
    *   } else {
    *     app.tell('Number two is a great choice!');
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(app.StandardIntents.TEXT, welcomeIntent);
    * actionMap.set(app.StandardIntents.OPTION, optionIntent);
    * app.handleRequest(actionMap);
    *
    * @param inputPrompt Holding initial and
    *     no-input prompts. Cannot contain basic card.
    * @param list List built with {@link AssistantApp#buildList|buildList}.
    * @param dialogState JSON object the app uses to hold dialog state that
    *     will be circulated back by Assistant.
    * @return The response that is sent to Assistant to ask user to provide input.
    * @actionssdk
    */
  def askWithList(inputPrompt: js.Object, list: actionsDashOnDashGoogleLib.responseDashBuilderMod.List): expressLib.expressMod.Response | scala.Null = js.native
  def askWithList(
    inputPrompt: js.Object,
    list: actionsDashOnDashGoogleLib.responseDashBuilderMod.List,
    dialogState: js.Object
  ): expressLib.expressMod.Response | scala.Null = js.native
  /**
    * Builds the {@link https://developers.google.com/actions/reference/conversation#InputPrompt|InputPrompt object}
    *     from initial prompt and no-input prompts.
    *
    * The App needs one initial prompt to start the conversation. If there is no user response,
    * the App re-opens the mic and renders the no-input prompts three times
    * (one for each no-input prompt that was configured) to help the user
    * provide the right response.
    *
    * Note: we highly recommend app to provide all the prompts required here in order to ensure a
    * good user experience.
    *
    * @example
    * const inputPrompt = app.buildInputPrompt(false, 'Welcome to action snippets! Say a number.',
    *     ['Say any number', 'Pick a number', 'What is the number?']);
    * app.ask(inputPrompt);
    *
    * @param isSsml Indicates whether the text to speech is SSML or not.
    * @param initialPrompt The initial prompt the App asks the user.
    * @param noInputs Array of re-prompts when the user does not respond (max 3).
    * @return.
    * @actionssdk
    */
  def buildInputPrompt(isSsml: scala.Boolean, initialPrompt: java.lang.String): js.Object = js.native
  def buildInputPrompt(isSsml: scala.Boolean, initialPrompt: java.lang.String, noInputs: js.Array[java.lang.String]): js.Object = js.native
  /**
    * Gets the "versionLabel" specified inside the Action Package.
    * Used by app to do version control.
    *
    * @example
    * const app = new ActionsSdkApp({request: request, response: response});
    * const actionVersionLabel = app.getActionVersionLabel();
    *
    * @return The specified version label or null if unspecified.
    * @actionssdk
    */
  def getActionVersionLabel(): java.lang.String = js.native
  /**
    * Gets the request Conversation API version.
    *
    * @example
    * const app = new ActionsSdkApp({request: request, response: response});
    * const apiVersion = app.getApiVersion();
    *
    * @return Version value or null if no value.
    * @actionssdk
    */
  def getApiVersion(): java.lang.String = js.native
  /**
    * Get the argument value by name from the current intent. If the argument
    * is not a text argument, the entire argument object is returned.
    *
    * Note: If incoming request is using an API version under 2 (e.g. 'v1'),
    * the argument object will be in Proto2 format (snake_case, etc).
    *
    * @param argName Name of the argument.
    * @return Argument value matching argName
    *     or null if no matching argument.
    * @actionssdk
    */
  def getArgument(argName: java.lang.String): java.lang.String = js.native
  /**
    * Gets the unique conversation ID. It's a new ID for the initial query,
    * and stays the same until the end of the conversation.
    *
    * @example
    * const app = new ActionsSdkApp({request: request, response: response});
    * const conversationId = app.getConversationId();
    *
    * @return Conversation ID or null if no value.
    * @actionssdk
    */
  def getConversationId(): java.lang.String = js.native
  /**
    * Gets previous JSON dialog state that the app sent to Assistant.
    * Alternatively, use the app.data field to store JSON values between requests.
    *
    * @example
    * const app = new ActionsSdkApp({request: request, response: response});
    * const dialogState = app.getDialogState();
    *
    * @return JSON object provided to the Assistant in the previous
    *     user turn or {} if no value.
    * @actionssdk
    */
  def getDialogState(): js.Any = js.native
  /**
    * Get the current intent. Alternatively, using a handler Map with
    * {@link AssistantApp#handleRequest|handleRequest}, the client library will
    * automatically handle the incoming intents.
    *
    * @example
    * const app = new ActionsSdkApp({request: request, response: response});
    *
    * function responseHandler (app) {
    *   const intent = app.getIntent();
    *   switch (intent) {
    *     case app.StandardIntents.MAIN:
    *       const inputPrompt = app.buildInputPrompt(false, 'Welcome to action snippets! Say anything.');
    *       app.ask(inputPrompt);
    *       break;
    *
    *     case app.StandardIntents.TEXT:
    *       app.tell('You said ' + app.getRawInput());
    *       break;
    *   }
    * }
    *
    * app.handleRequest(responseHandler);
    *
    * @return Intent id or null if no value.
    * @actionssdk
    */
  def getIntent(): java.lang.String = js.native
  /**
    * Gets the user's raw input query.
    *
    * @example
    * const app = new ActionsSdkApp({request: request, response: response});
    * app.tell('You said ' + app.getRawInput());
    *
    * @return User's raw query or null if no value.
    * @actionssdk
    */
  def getRawInput(): java.lang.String = js.native
  /**
    * Returns the option key user chose from options response.
    *
    * @example
    * const app = new App({request: req, response: res});
    *
    * function pickOption (app) {
    *   if (app.hasSurfaceCapability(app.SurfaceCapabilities.SCREEN_OUTPUT)) {
    *     app.askWithCarousel('Which of these looks good?',
    *       app.buildCarousel().addItems(
    *         app.buildOptionItem('another_choice', ['Another choice']).
    *         setTitle('Another choice').setDescription('Choose me!')));
    *   } else {
    *     app.ask('What would you like?');
    *   }
    * }
    *
    * function optionPicked (app) {
    *   app.ask('You picked ' + app.getSelectedOption());
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(app.StandardIntents.TEXT, pickOption);
    * actionMap.set(app.StandardIntents.OPTION, optionPicked);
    *
    * app.handleRequest(actionMap);
    *
    * @return Option key of selected item. Null if no option selected or
    *     if current intent is not OPTION intent.
    * @actionssdk
    */
  def getSelectedOption(): java.lang.String = js.native
  /**
    * @deprecated
    * Validates whether request is from Assistant through signature verification.
    * Uses Google-Auth-Library to verify authorization token against given
    * Google Cloud Project ID. Auth token is given in request header with key,
    * "Authorization".
    *
    * @example
    * const app = new ActionsSdkApp({request, response});
    * app.isRequestFromAssistant('nodejs-cloud-test-project-1234')
    *   .then(() => {
    *     app.ask('Hey there, thanks for stopping by!');
    *   })
    *   .catch(err => {
    *     response.status(400).send();
    *   });
    *
    * @param projectId Google Cloud Project ID for the Assistant app.
    * @return Promise resolving with google-auth-library LoginTicket
    *     if request is from a valid source, otherwise rejects with the error reason
    *     for an invalid token.
    * @actionssdk
    */
  def isRequestFromAssistant(projectId: java.lang.String): js.Promise[js.Object] = js.native
  /**
    * Validates whether request is from Google through signature verification.
    * Uses Google-Auth-Library to verify authorization token against given
    * Google Cloud Project ID. Auth token is given in request header with key,
    * "Authorization".
    *
    * @example
    * const app = new ActionsSdkApp({request, response});
    * app.isRequestFromGoogle('nodejs-cloud-test-project-1234')
    *   .then(() => {
    *     app.ask('Hey there, thanks for stopping by!');
    *   })
    *   .catch(err => {
    *     response.status(400).send();
    *   });
    *
    * @param projectId Google Cloud Project ID for the Assistant app.
    * @return Promise resolving with google-auth-library LoginTicket
    *     if request is from a valid source, otherwise rejects with the error reason
    *     for an invalid token.
    * @actionssdk
    */
  def isRequestFromGoogle(projectId: java.lang.String): js.Promise[js.Object] = js.native
  def tell(textToSpeech: actionsDashOnDashGoogleLib.responseDashBuilderMod.RichResponse): expressLib.expressMod.Response | scala.Null = js.native
  def tell(textToSpeech: actionsDashOnDashGoogleLib.responseDashBuilderMod.SimpleResponse): expressLib.expressMod.Response | scala.Null = js.native
  /**
    * Tells Assistant to render the speech response and close the mic.
    *
    * @example
    * const app = new ActionsSdkApp({request: request, response: response});
    *
    * const noInputs = [
    *   `I didn't hear a number`,
    *   `If you're still there, what's the number?`,
    *   'What is the number?'
    * ];
    *
    * function mainIntent (app) {
    *   const ssml = '<speak>Hi! <break time="1"/> ' +
    *     'I can read out an ordinal like ' +
    *     '<say-as interpret-as="ordinal">123</say-as>. Say a number.</speak>';
    *   const inputPrompt = app.buildInputPrompt(true, ssml, noInputs);
    *   app.ask(inputPrompt);
    * }
    *
    * function rawInput (app) {
    *   if (app.getRawInput() === 'bye') {
    *     app.tell('Goodbye!');
    *   } else {
    *     const ssml = '<speak>You said, <say-as interpret-as="ordinal">' +
    *       app.getRawInput() + '</say-as></speak>';
    *     const inputPrompt = app.buildInputPrompt(true, ssml, noInputs);
    *     app.ask(inputPrompt);
    *   }
    * }
    *
    * const actionMap = new Map();
    * actionMap.set(app.StandardIntents.MAIN, mainIntent);
    * actionMap.set(app.StandardIntents.TEXT, rawInput);
    *
    * app.handleRequest(actionMap);
    *
    * @param textToSpeech Final response.
    *     Spoken response can be SSML.
    * @return The HTTP response that is sent back to Assistant.
    * @actionssdk
    */
  def tell(textToSpeech: java.lang.String): expressLib.expressMod.Response | scala.Null = js.native
}

